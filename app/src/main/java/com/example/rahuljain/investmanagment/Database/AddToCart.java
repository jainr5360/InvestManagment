package com.example.rahuljain.investmanagment.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Rahul jain on 06-07-2017.
 */

public class AddToCart extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "addToCart.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "AddToCart";
    public static final String KEY_ID = "key_id";
    public static final String CUSTOMER_ID = "customer_id";

    public AddToCart(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
