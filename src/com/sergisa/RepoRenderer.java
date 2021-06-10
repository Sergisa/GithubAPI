package com.sergisa;

import javax.swing.*;
import java.awt.*;

public class RepoRenderer extends JLabel implements ListCellRenderer<Repo> {
    private final Color defaultListCellColour = Color.WHITE;
    public RepoRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Repo> jList, Repo repo, int i, boolean isSelected, boolean cellHasFocus) {
        setText(repo.name);
        if (cellHasFocus) {
            setBackground(Color.CYAN);
        } else {
            setBackground(defaultListCellColour);
        }

        if(isSelected){
            setBackground(Color.GREEN);
        }else{
            setBackground(defaultListCellColour);
        }
        return this;
    }
}
