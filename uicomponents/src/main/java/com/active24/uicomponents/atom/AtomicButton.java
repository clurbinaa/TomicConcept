package com.active24.uicomponents.atom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;

import com.active24.uicomponents.R;

public class AtomicButton extends AppCompatButton {

    public enum Type {
        DEFAULT(0),
        PINK(1),
        WHITE_NEXT(2),
        DARK_GRAY(3);

        private int type;

        Type(int type){
            this.type = type;
        }

        public int getType() {
            return type;
        }

        static Type fromId(int id) {
            for (Type f : values()) {
                if (f.type == id)
                    return f;
            }
            return DEFAULT;
        }
    }

    private Type type = Type.DEFAULT;

    public AtomicButton(Context context) {
        super(context);
        init(context, null);
    }

    public AtomicButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public AtomicButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs){
        if (attrs != null) {
            TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.AtomicButton,
                    0, 0);
            try {
                type = Type.fromId(typedArray.getInt(R.styleable.AtomicButton_button_style, Type.DEFAULT.getType()));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                customizeView();
                typedArray.recycle();
            }
        }

    }

    private void customizeView() {
        this.setMinHeight(getContext().getResources().getDimensionPixelSize(R.dimen.dimen_height_button));
        this.setTypeface(Typeface.create("sans-serif-medium", Typeface.NORMAL));
        this.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        this.setAllCaps(false);
        this.setGravity(Gravity.CENTER);
        switch (type){
            case DEFAULT:
            case PINK:
                setTextColor(ContextCompat.getColor(getContext(), R.color.white_ripple));
                this.setBackgroundDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ripple_pink));
                break;
            case WHITE_NEXT:
                this.setTextColor(ContextCompat.getColor(getContext(), R.color.rosaLiverpool));
                Drawable arrow = ContextCompat.getDrawable(getContext(), R.drawable.flecha_adelante_rosa);
                this.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, arrow, null);
                this.setBackgroundDrawable(ContextCompat.getDrawable(getContext(), R.drawable.white_button_ripple));
                this.setPadding(0,0,30,0);
                break;
            case DARK_GRAY:
                this.setTextColor(ContextCompat.getColor(getContext(), R.color.white_ripple));
                this.setBackgroundDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark_gray_ripple));
                break;
        }
    }

    public void setTextViewType(Type type){
        this.type = type;
        customizeView();
    }
}
