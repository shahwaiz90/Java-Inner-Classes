package NestedInterface;

public class Events {

    private View.onClickListener clickListener;
    private View.onFocusChangeListener focusChangeListener;

    public void setOnClickListener(View.onClickListener listener){
        clickListener = listener;
    }

    public void setClicked(){
        if(clickListener!=null) {
            clickListener.onClick();
        }
    }

    public void setOnFocusListener(View.onFocusChangeListener listener){
        focusChangeListener = listener;
    }

    public void setFocused(){
        if(focusChangeListener!=null) {
            focusChangeListener.onFocus();
        }
    }
}
