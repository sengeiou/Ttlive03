package com.likeits.ttlive.activitys.ui.me;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.likeits.ttlive.R;
import com.likeits.ttlive.activitys.base.Container;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MemberActivity extends Container {
    @BindView(R.id.tv_header)
    TextView tvHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        tvHeader.setText("购买会员");
    }

    @OnClick(R.id.backBtn)
    public void Onclick(View v) {
        onBackPressed();
    }
}