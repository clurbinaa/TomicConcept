package com.active24.uicomponents.molecule;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.active24.uicomponents.R;

public class PriceMolecule extends LinearLayout {

    private TextView normalPrice;
    private TextView promotionPrice;
    private TextView regularPrice;
    private TextView transferPrice;
    private Type type = Type.NORMAL;
    private CharSequence normal;
    private CharSequence promotion;
    private CharSequence regular;
    private CharSequence transfer;


    public enum Type {
        NORMAL(0),
        DISCOUNT(1),
        TRANSFER(2);

        private int type;

        Type(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }

        static PriceMolecule.Type fromId(int id) {
            for (PriceMolecule.Type f : values()) {
                if (f.type == id)
                    return f;
            }
            return NORMAL;
        }

    }

    public PriceMolecule(Context context) {
        super(context);
    }

    public PriceMolecule(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        inflate(context, R.layout.molecule_price, this);
        int[] sets = {R.attr.normalPrice, R.attr.regularPrice, R.attr.promotionPrice, R.attr.transferPrice};
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs, R.styleable.MoleculePrice, 0, 0);
        type = PriceMolecule.Type.fromId(typedArray.getInt(R.styleable.MoleculePrice_price_type, Type.NORMAL.getType()));
        normal = typedArray.getText(R.styleable.MoleculePrice_normalPrice);
        promotion = typedArray.getText(R.styleable.MoleculePrice_promotionPrice);
        regular = typedArray.getText(R.styleable.MoleculePrice_regularPrice);
        transfer = typedArray.getText(R.styleable.MoleculePrice_transferPrice);
        initComponents();
        setTypeView();
    }

    private void setTypeView() {
        switch (type) {
            case NORMAL:
                normalPrice.setVisibility(VISIBLE);
                if (normal != null)
                    normalPrice.setText(normal);
                promotionPrice.setVisibility(GONE);
                regularPrice.setVisibility(GONE);
                break;
            case DISCOUNT:
                if (promotion != null && regular != null) {
                    promotionPrice.setText(promotion);
                    regularPrice.setText(regular);
                }
                normalPrice.setVisibility(GONE);
                promotionPrice.setVisibility(VISIBLE);
                regularPrice.setVisibility(VISIBLE);
                break;
            case TRANSFER:
                if (normal != null && transfer != null) {
                    normalPrice.setText(normal);
                    transferPrice.setText(transfer);
                }
                normalPrice.setVisibility(VISIBLE);
                promotionPrice.setVisibility(GONE);
                regularPrice.setVisibility(GONE);
                transferPrice.setVisibility(VISIBLE);
                break;

        }
    }

    private void initComponents() {
        normalPrice = findViewById(R.id.normal_price);
        promotionPrice = findViewById(R.id.promotion_price);
        regularPrice = findViewById(R.id.regular_price);
        transferPrice = findViewById(R.id.trasnfer_price);
    }

    public PriceMolecule(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PriceMolecule(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
