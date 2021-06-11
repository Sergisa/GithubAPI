package com.sergisa;

import javax.naming.directory.SearchResult;
import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Collections;

public class RepoRenderer extends JPanel implements ListCellRenderer<Repo> {
    private final Color defaultListCellColour = Color.WHITE;
    private JPanel root;
    private JLabel author;
    private JLabel language;
    private JLabel name;
    private JPanel panelText;

    public RepoRenderer() {
        setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        setOpaque(false);
        setLayout(new BorderLayout(6, 6));
        GridLayout grid = new GridLayout(0,1,5,5);
        name = new JLabel();
        author = new JLabel();
        language = new JLabel();
        panelText = new JPanel(grid);
        panelText.setOpaque(true);
        author.setOpaque(false);
        language.setFont(new Font("Dialog", Font.BOLD, 12));
        panelText.add(name);
        panelText.add(language);
        add(author, BorderLayout.WEST);
        add(panelText, BorderLayout.CENTER);

    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Repo> jList, Repo repo, int i, boolean isSelected, boolean cellHasFocus) {
        name.setText(repo.name);
        author.setText(repo.owner.name);
        language.setText(repo.language);

        //lbName.setOpaque(true);
        //lbAuthor.setOpaque(true);

        if (cellHasFocus) {
            panelText.setBackground(Color.CYAN);
        } else {
            panelText.setBackground(defaultListCellColour);
        }

        if (isSelected) {
            panelText.setBackground(Color.GREEN);
        } else {
            panelText.setBackground(defaultListCellColour);
        }
        return this;
    }
}
