package com.ilham.mymobile2;


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
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAtas extends Fragment {

    WebView webView;
    public static String webUrl;

    public FragmentAtas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_atas, container, false);
        ActionBar toolbar = ((AppCompatActivity) getActivity()).getSupportActionBar();

        webView = view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        Bundle bundle = getArguments();

        if (bundle != null){
            toolbar.setTitle(bundle.getString("WebLinks"));
            if (toolbar.getTitle().toString().equalsIgnoreCase("Google")) {
                webView.loadUrl("https://www.google.com/");
                Toast.makeText(getContext(), "Welcome to Google", Toast.LENGTH_SHORT).show();
            }
            if (toolbar.getTitle().toString().equalsIgnoreCase("Facebook")) {
                webView.loadUrl("https://web.facebook.com/");
                Toast.makeText(getContext(), "Welcome to Facebook", Toast.LENGTH_SHORT).show();
            }
            if (toolbar.getTitle().toString().equalsIgnoreCase("Instagram")) {
                webView.loadUrl("https://www.instagram.com/");
                Toast.makeText(getContext(), "Welcome to Instagram", Toast.LENGTH_SHORT).show();
            }
            if (toolbar.getTitle().toString().equalsIgnoreCase("Github")) {
                webView.loadUrl("https://github.com/oryfikry");
                Toast.makeText(getContext(), "Welcome to Github", Toast.LENGTH_SHORT).show();
            }
        }

        return view;
    }
}
