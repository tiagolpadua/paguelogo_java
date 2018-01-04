package com.timsoft.paguelogo.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Conta.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract Conta contaDao();
}
