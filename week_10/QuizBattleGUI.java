package week_10;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class QuizBattleGUI extends JFrame {

    private List<Questions> questions;
    private int currentQuestionIndex = 0;

    private int player1Score = 0;
    private int player2Score = 0;
    private boolean player1Turn = true;

    private JLabel questionLabel;
    private JLabel turnLabel;
    private JLabel scoreLabel;
    private JButton[] optionButtons;
    private JButton nextButton;

    public QuizBattleGUI() {
        super("Quiz Battle");

        questions = Questions.loadSampleQuestions();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Top panel: turn + score info
        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        turnLabel = new JLabel("", SwingConstants.CENTER);
        turnLabel.setFont(new Font("Arial", Font.BOLD, 16));
        scoreLabel = new JLabel("", SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        topPanel.add(turnLabel);
        topPanel.add(scoreLabel);
        add(topPanel, BorderLayout.NORTH);

        // Center panel: question + options
        JPanel centerPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        centerPanel.add(questionLabel);

        optionButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            JButton btn = new JButton();
            final int optionIndex = i;
            btn.addActionListener(e -> handleAnswer(optionIndex));
            optionButtons[i] = btn;
            centerPanel.add(btn);
        }
        add(centerPanel, BorderLayout.CENTER);

        // Bottom panel: next button
        nextButton = new JButton("Next Question");
        nextButton.setEnabled(false);
        nextButton.addActionListener(e -> loadNextQuestion());
        add(nextButton, BorderLayout.SOUTH);

        loadQuestion(currentQuestionIndex);
        setVisible(true);
    }

    private void loadQuestion(int index) {
        if (index >= questions.size()) {
            endGame();
            return;
        }

        Questions q = questions.get(index);
        questionLabel.setText("<html><div style='text-align:center;'>" + q.getQuestion() + "</div></html>");

        String[] opts = q.getOptions();
        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i].setText(opts[i]);
            optionButtons[i].setEnabled(true);
            optionButtons[i].setBackground(null);
        }

        nextButton.setEnabled(false);
        updateTurnLabel();
        updateScoreLabel();
    }

    private void handleAnswer(int chosenIndex) {
        Questions q = questions.get(currentQuestionIndex);
        boolean correct = q.isCorrect(chosenIndex);

        optionButtons[q.getCorrectIndex()].setBackground(Color.GREEN);
        if (!correct) {
            optionButtons[chosenIndex].setBackground(Color.RED);
        }

        if (correct) {
            if (player1Turn) {
                player1Score++;
            } else {
                player2Score++;
            }
        }

        for (JButton btn : optionButtons) {
            btn.setEnabled(false);
        }

        updateScoreLabel();
        nextButton.setEnabled(true);
    }

    private void loadNextQuestion() {
        player1Turn = !player1Turn;
        currentQuestionIndex++;
        loadQuestion(currentQuestionIndex);
    }

    private void updateTurnLabel() {
        turnLabel.setText(player1Turn ? "Player 1's Turn" : "Player 2's Turn");
    }

    private void updateScoreLabel() {
        scoreLabel.setText("Player 1: " + player1Score + "   |   Player 2: " + player2Score);
    }

    private void endGame() {
        String result;
        if (player1Score > player2Score) {
            result = "Player 1 Wins!";
        } else if (player2Score > player1Score) {
            result = "Player 2 Wins!";
        } else {
            result = "It's a Tie!";
        }

        JOptionPane.showMessageDialog(this,
                "Game Over!\nPlayer 1: " + player1Score + "\nPlayer 2: " + player2Score + "\n\n" + result,
                "Quiz Battle Results",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizBattleGUI::new);
    }
}