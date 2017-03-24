package com.bobo.homework2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
    private EditText input;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        input = (EditText) findViewById(R.id.ed_input);
        button = (Button) findViewById(R.id.B_sayhello);
        button.setOnClickListener(calcResult);
        getOverflowMenu();
    }

    private void getOverflowMenu() {
        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if(menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private View.OnClickListener calcResult = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String Input = input.getText().toString();
            if(Input.length() !=0) {
                Toast.makeText(MainActivity.this, Input, Toast.LENGTH_LONG)
                        .show();
            }
            input.setText(null);
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //noinspection SimplifiableIfStatement
        switch(item.getItemId()){
            case R.id.action_clear:
                input.setText("");
                break;
            case R.id.action_about:
                AlertDialog.Builder Alert = new AlertDialog.Builder(this);
                Alert.setTitle("關於本程式");
                Alert.setMessage("作者:陳柏翔");
                DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                };
                Alert.setPositiveButton("確定", listener)
                        .show();
                break;
            case  R.id.action_story:
                Toast.makeText(MainActivity.this, "嗨 大家好 我是爛蕉 \n" +
                        "白目紀元是一款真正的智障遊戲\n" +
                        "最一開始我會打\n" +
                        "是因為膠豬也有在打\n" +
                        "然後我去他家\n" +
                        "看到他一直在打\n" +
                        "他也推薦我打\n" +
                        "然後我只要一上線\n" +
                        "他就說叫我把精子運給他\n" +
                        "我一開始都一直運給他喔\n" +
                        "到後面我慢慢發現\n" +
                        "我精子幾乎是不太夠用了\n" +
                        "然後他還一直叫我給他\n" +
                        "我想說\n" +
                        "那我打這個飛機的意義到底是什麼\n" +
                        "是因為他打嗎\n" +
                        "我就跟他說\n" +
                        "精子你要你自己去看片就好\n" +
                        "我自己也要用啊\n" +
                        "然後他只要跟我講\n" +
                        "我就都沒給他了\n" +
                        "我覺得一開始打飛機遊戲的時候啊\n" +
                        "通常都是在睡覺之前這樣子打\n" +
                        "然後我也想說是打發時間的遊~戲\n" +
                        "結果玩白目紀元之後\n" +
                        "才發現\n" +
                        "他其實有很多模式\n" +
                        "是有那種搞Gay的\n" +
                        "10p的\n" +
                        "還可以練精跟大家對~打\n" +
                        "其實我在出外景、收工\n" +
                        "還有在等通告的時候\n" +
                        "我都會拿J來打\n" +
                        "因為那個光是等那些時間\n" +
                        "要馬上一直上去去更新JJ\n" +
                        "才會比較快節省時間這樣子\n" +
                        "然後我現在無時無刻都會一直打\n" +
                        "其實我抓空檔的時候上線\n" +
                        "是為了要去採集一些精子\n" +
                        "然後研發春袋\n" +
                        "因為春袋在策略遊戲中呀\n" +
                        "是非常重要的一環\n" +
                        "不鑽研~不行！\n" +
                        "其實這個遊戲裡面\n" +
                        "我最喜歡的一個功能就是\n" +
                        "集交這個系統\n" +
                        "我之前在打手機遊戲的時候\n" +
                        "大部分都是練角\n" +
                        "一定要練得比別人強\n" +
                        "就很有成就感\n" +
                        "可是玩白目紀元不是\n" +
                        "在聯盟裡面\n" +
                        "團交跟和諧其實是最重要的\n" +
                        "像是我朋友阿\n" +
                        "如果被打的話\n" +
                        "我們就可以派精去攻打\n" +
                        "我覺得呀\n" +
                        "去攻打人家的飛機和女優呀\n" +
                        "最過癮的一件事\n" +
                        "大家一起集結精力\n" +
                        "同時把人家攻打\n" +
                        "那個女優倒的時候\n" +
                        "我看到那個動畫很H\n" +
                        "我自己心裡感覺也很感動\n" +
                        "這是大家一起完成的事情\n" +
                        "不是自己一個人的事情\n" +
                        "其實之前在白目大戰開打的時候呀\n" +
                        "我有跑到別的房間去清他們的精\n" +
                        "之後才知道是華人精\n" +
                        "因為他們華人精精主\n" +
                        "跑到我們的性交頻道上面\n" +
                        "一直來抱怨\n" +
                        "我看那個ID\n" +
                        "阿… TMD是他\n" +
                        "然後我們的雜交官就有在上面\n" +
                        "特地因為這件事喔\n" +
                        "一直幫我雜交\n" +
                        "我一直擔心\n" +
                        "會不會被射掉阿\n" +
                        "結果也沒被射掉\n" +
                        "之後我是覺得滿抱歉的\n" +
                        "可是\n" +
                        "其實我也賺到我的那些J J數\n" +
                        "其實我覺得是很划算的\n" +
                        "白目紀元人多才好玩\n" +
                        "保證你一打絕對停不下來\n" +
                        "趕快來看片\n" +
                        "爛蕉在487伺服器等你們\n" +
                        "趕快一起來射爆外國人吧", Toast.LENGTH_LONG)
                        .show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}