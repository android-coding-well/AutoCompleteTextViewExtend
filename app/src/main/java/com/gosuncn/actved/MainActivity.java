package com.gosuncn.actved;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.gosuncn.actved.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    public void onClickAdd(View view) {
        int size=binding.autoCompleteTextViewExtend.getRecordDatas().size();
        size++;
        binding.autoCompleteTextViewExtend.saveRecord("历史记录"+size);
    }
    public void onClickDel(View view) {
        int size=binding.autoCompleteTextViewExtend.getRecordDatas().size();
        binding.autoCompleteTextViewExtend.deleteRecord("历史记录"+size);
    }
    public void onClickClear(View view) {
        binding.autoCompleteTextViewExtend.clearAllRecord();
    }
}
