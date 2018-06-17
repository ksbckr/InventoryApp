package de.ksbckr.app.inventory.adapters;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import java.util.Currency;
import java.util.Locale;

import de.ksbckr.app.inventory.R;
import de.ksbckr.app.inventory.db.ItemContract;


public class ItemCursorAdapter extends CursorAdapter {

    public ItemCursorAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView nameTextView = (TextView) view.findViewById(R.id.name);
        TextView quantityTextView = (TextView) view.findViewById(R.id.quantity);
        TextView priceTextView = (TextView) view.findViewById(R.id.price);

        int nameColumnIndex = cursor.getColumnIndex(ItemContract.ItemEntry.COLUMN_ITEM_NAME);
        int quantityColumnIndex = cursor.getColumnIndex(ItemContract.ItemEntry.COLUMN_ITEM_QUANTITY);
        int priceColumnIndex = cursor.getColumnIndex(ItemContract.ItemEntry.COLUMN_ITEM_PRICE);

        String nameValue = cursor.getString(nameColumnIndex);
        String quantityValue = cursor.getString(quantityColumnIndex);
        String priceValue = cursor.getString(priceColumnIndex);

        nameTextView.setText(nameValue);
        quantityTextView.setText(quantityValue);
        String currencySymbol = Currency.getInstance(Locale.getDefault()).getSymbol();
        priceTextView.setText(priceValue + " " + currencySymbol);
    }
}
