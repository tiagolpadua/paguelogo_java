package com.timsoft.paguelogo.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ContaDao {
    @Query("SELECT * FROM user")
    List<Conta> getAll();

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    List<Conta> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND "
            + "last_name LIKE :last LIMIT 1")
    Conta findByName(String first, String last);

    @Insert
    void insertAll(Conta... contas);

    @Delete
    void delete(Conta conta);
}
