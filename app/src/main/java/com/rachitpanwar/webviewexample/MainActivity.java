    package com.rachitpanwar.webviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

    public class MainActivity extends AppCompatActivity {

    WebView simpleWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleWebView = (WebView)findViewById(R.id.simpleWebView);
        simpleWebView.setWebViewClient(new MyWebViewClient());
        String url = "https://www.google.com";
        simpleWebView.getSettings().setJavaScriptEnabled(true);
        simpleWebView.loadUrl(url);


    }

        private class MyWebViewClient extends WebViewClient {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        }
        public void onBackPressed() {
            if(simpleWebView.canGoBack())
            {
                simpleWebView.goBack();
            }

            else
            {
                super.onBackPressed();
            }
        }
}
