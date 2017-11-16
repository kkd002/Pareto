package com.example.daniel.pareto;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity
public class Pareto
{
    @PrimaryKey
    private int id;

    @ColumnInfo
    private String aTask, bTask, cTask, dTask, eTask;

    public Pareto()
    {

    }

    public void setaTask(String aTask)
    {
        this.aTask = aTask;
    }

    public void setbTask(String bTask)
    {
        this.bTask = bTask;
    }

    public void setcTask(String cTask)
    {
        this.cTask = cTask;
    }

    public void setdTask(String dTask)
    {
        this.dTask = dTask;
    }

    public void seteTask(String eTask)
    {
        this.eTask = eTask;
    }
}
