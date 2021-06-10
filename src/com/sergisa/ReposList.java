package com.sergisa;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;

public class ReposList extends JFrame{
    private JList<Repo> repositoriesList;
    private JPanel root;
    private JLabel authorLabel;
    private JLabel nameLabel;
    private JLabel languageLabel;
    DefaultListModel<Repo> repositoryListViewModel;

    public ReposList() {
        repositoryListViewModel = new DefaultListModel<>();
        setContentPane(root);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        repositoriesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        repositoriesList.setCellRenderer(new RepoRenderer());
        repositoriesList.setModel(repositoryListViewModel);

        repositoriesList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if (!listSelectionEvent.getValueIsAdjusting()) {
                    Repo selectedRepository = (Repo) repositoriesList.getSelectedValue();
                    updateData(selectedRepository);
                }
            }
        });
    }

    public void fillData(List<Repo> repos){
        repositoryListViewModel.addAll(repos);
    }

    public void updateData(Repo currentRepository){
        authorLabel.setText(currentRepository.owner.name);
        nameLabel.setText(currentRepository.name);
        languageLabel.setText(currentRepository.language);
    }
}
