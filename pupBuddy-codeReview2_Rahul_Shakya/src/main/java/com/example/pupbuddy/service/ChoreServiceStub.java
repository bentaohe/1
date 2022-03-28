package com.example.pupbuddy.service;

import com.example.pupbuddy.dao.IChoreDAO;
import com.example.pupbuddy.dto.Chore;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ChoreServiceStub implements IChoreService{

    @Autowired
    private IChoreDAO choreDAO;

    public ChoreServiceStub(){}

    public ChoreServiceStub(IChoreDAO choreDAO) {this.choreDAO = choreDAO;}

    @Override
    public Chore fetchById(int id) {
        Chore foundChore = choreDAO.fetch(id);
        return foundChore;
    }

    @Override
    public void delete(int id) throws Exception {
        choreDAO.delete(id);
    }

    @Override
    public Chore save(Chore chore) throws Exception {
        return choreDAO.save(chore);
    }

    @Override
    public List<Chore> fetchAll() {
        return choreDAO.fetchAll();
    }
}
