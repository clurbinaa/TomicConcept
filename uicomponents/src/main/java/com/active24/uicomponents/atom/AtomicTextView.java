package com.active24.uicomponents.atom;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.active24.uicomponents.R;

public class AtomicTextView extends AppCompatTextView {

    public enum Type {
        DEFAULT(0),
        TITLE(1),
        SUBTITLE_1(2),
        SUBTITLE_2(3),
        BODY_1(4);

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

    public AtomicTextView(Context context) {
        super(context);
        init(context, null);
    }

    public AtomicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public AtomicTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs){
        if (attrs != null) {
            TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.AtomicTextView,
                    0, 0);
            try {
                type = Type.fromId(typedArray.getInt(R.styleable.AtomicTextView_atom_style, Type.DEFAULT.getType()));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                customizeView();
                typedArray.recycle();
            }
        }

    }

    private void customizeView() {
        switch (type){
            case TITLE:
                this.setTextAppearance(getContext(), R.style.AppTheme_Text_Title);
                break;
            case SUBTITLE_1:
                this.setTextAppearance(getContext(), R.style.AppTheme_Text_Subtitle1);
                break;
            case SUBTITLE_2:
                this.setTextAppearance(getContext(), R.style.AppTheme_Text_Subtitle2);
                break;
            case DEFAULT:
            case BODY_1:
                this.setTextAppearance(getContext(), R.style.AppTheme_Text_Body1);
                break;
        }
    }

    public void setTextViewType(Type type){
        this.type = type;
        customizeView();
    }
}
