package de.ksbckr.app.inventory.db;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;


public final class ItemContract {

    //An empty private constructor makes sure that the class is not going to be initialised.
    private ItemContract() {}

    public static final String CONTENT_AUTHORITY = "de.ksbckr.app.inventory";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_ITEMS = "items";


    public static final class ItemEntry implements BaseColumns {

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_ITEMS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_ITEMS;

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_ITEMS);

        public final static String TABLE_NAME = "items";

        public final static String COLUMN_ITEM_NAME ="product_name";


        public final static String COLUMN_ITEM_PRICE = "price";


        public final static String COLUMN_ITEM_QUANTITY = "quantity";


        public final static String COLUMN_ITEM_SUPPLIER_NAME = "supplier_name";

        public final static String COLUMN_ITEM_SUPPLIER_PHONENUMBER = "supplier_phone_number";
    }

}

