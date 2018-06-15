package de.ksbckr.app.inventory.db;

import android.provider.BaseColumns;

import java.util.function.Supplier;


public final class ItemContract {

    private ItemContract() {}


    public static final class ItemEntry implements BaseColumns {


        public final static String TABLE_NAME = "items";


        public final static String _ID = BaseColumns._ID;


        public final static String COLUMN_ITEM_NAME ="product_name";


        public final static String COLUMN_ITEM_PRICE = "price";


        public final static String COLUMN_ITEM_QUANTITY = "quantity";


        public final static String COLUMN_ITEM_SUPPLIER_NAME = "supplier_name";

        public final static String COLUMN_ITEM_SUPPLIER_PHONENUMBER = "supplier_phone_number";
    }

}

