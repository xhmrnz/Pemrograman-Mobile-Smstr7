package com.ilham.mymobile2;


import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAtas extends Fragment {

    WebView webView;
    TextView textView;
    public FragmentAtas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_atas, container, false);
        ActionBar toolbar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        textView = view.findViewById(R.id.tv_empty);
        webView = view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        textView.setText(getResources().getString(R.string.no_webpage));

        Bundle bundle = getArguments();
        if (bundle != null){
            toolbar.setTitle(bundle.getString("WebLinks"));
            if (toolbar.getTitle().toString().equalsIgnoreCase("Google"))
            {
                textView.setText(getResources().getString(R.string.load_webpage));
                webView.loadUrl("https://www.google.com/");
                Toast.makeText(getContext(), "Menyambungkan ke Google", Toast.LENGTH_SHORT).show();
            }
            if (toolbar.getTitle().toString().equalsIgnoreCase("Facebook")) {
                textView.setText(getResources().getString(R.string.load_webpage));
                webView.loadUrl("https://web.facebook.com/404system");
                Toast.makeText(getContext(), "Menyambungkan ke Facebook", Toast.LENGTH_SHORT).show();
            }
            if (toolbar.getTitle().toString().equalsIgnoreCase("Instagram")) {
                textView.setText(getResources().getString(R.string.load_webpage));
                webView.loadUrl("https://www.instagram.com/lhmrnfrzrfr");
                Toast.makeText(getContext(), "Menyambungkan ke Instagram", Toast.LENGTH_SHORT).show();
            }
            if (toolbar.getTitle().toString().equalsIgnoreCase("Twitter")) {
                textView.setText(getResources().getString(R.string.load_webpage));
                webView.loadUrl("https://twitter.com/lhmrnfrzrfr");
                Toast.makeText(getContext(), "Menyambungkan ke Twitter", Toast.LENGTH_SHORT).show();
            }
            if (toolbar.getTitle().toString().equalsIgnoreCase("Github")) {
                textView.setText(getResources().getString(R.string.load_webpage));
                webView.loadUrl("https://github.com/lhmrnfrzrfr");
                Toast.makeText(getContext(), "Menyambungkan ke Github", Toast.LENGTH_SHORT).show();
            }
        }

        return view;
    }

}
