import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ToDoList extends JFrame {
    private DefaultListModel<String> listModel;
    private JList<String> taskList;
    private JTextField taskInput;
    private JButton addButton;
    private JButton removeButton;
    private JButton clearButton;
    private JLabel taskCountLabel;

    public ToDoList() {
       
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        taskList.setFont(new Font("Arial", Font.PLAIN, 16));
        taskInput = new JTextField(20);
        addButton = new JButton("Add Task");
        removeButton = new JButton("Remove Task");
        clearButton = new JButton("Clear All");
        taskCountLabel = new JLabel("Tasks: 0", SwingConstants.CENTER);

       
        setLayout(new BorderLayout(10, 10));
        taskCountLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        topPanel.setBackground(new Color(50, 150, 200));
        topPanel.add(new JLabel("To-Do List", SwingConstants.CENTER));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 1, 10, 10));
        inputPanel.setBackground(new Color(230, 230, 250));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel taskEntryPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        taskEntryPanel.add(taskInput);
        taskEntryPanel.add(addButton);

        JPanel taskActionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        taskActionPanel.add(removeButton);
        taskActionPanel.add(clearButton);

        inputPanel.add(taskEntryPanel);
        inputPanel.add(taskActionPanel);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createTitledBorder("Your Tasks"));
        centerPanel.add(new JScrollPane(taskList), BorderLayout.CENTER);
        centerPanel.add(taskCountLabel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskInput.getText().trim();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskInput.setText("");
                    updateTaskCount();
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                    updateTaskCount();
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.clear();
                updateTaskCount();
            }
        });

       
        setTitle("Enhanced To-Do List");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateTaskCount() {
        taskCountLabel.setText("Tasks: " + listModel.size());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToDoList::new);
    }
}
