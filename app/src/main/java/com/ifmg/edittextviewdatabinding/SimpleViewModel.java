package com.ifmg.edittextviewdatabinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SimpleViewModel extends ViewModel {
    public MutableLiveData<String> text = new MutableLiveData<>();

    public SimpleViewModel() {
        this.text.setValue("Hello World!");
    }

    public MutableLiveData<String> getText() {
        return text;
    }

    public void setText(CharSequence text) {
        this.text.setValue(text.toString());
    }
}
