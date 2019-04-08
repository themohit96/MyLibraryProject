package com.thegiant.mylibraryproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.thegiant.mylibraryproject.Model.SaxenaLibrary;

public class ShowBook extends AppCompatActivity {

    private StorageReference storageReference;
    private StorageReference ref;

    private WebView webView;
    private String url="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_book);

        webView=findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);

        storageReference=FirebaseStorage.getInstance().getReference();
        ref=storageReference.child("FF.pdf");


        Intent intent=getIntent();
        url= SaxenaLibrary.SubSelector(intent.getStringExtra("SubName"));
        openWebPage(url);


        String drive="https://drive.google.com/open?id=1F6aK9fZPL95hdxgjtAo4DEg13BUx3vzM";
        String fire1="gs://mylibraryproject-ea010.appspot.com/FF.pdf";
        String fire2="https://firebasestorage.googleapis.com/v0/b/mylibraryproject-ea010.appspot.com/o/FF.pdf?alt=media&token=cae9607b-b75b-4e9a-a020-16f087e1d42f";
        final String test="http://drive.google.com/viewerng/viewer?embedded=true&url=";



      /* ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
           @Override
           public void onSuccess(Uri uri) {
               //url=uri.getPath();
               String tempUrl=uri.getPath();
               openWebPage(tempUrl);
               Toast.makeText(ShowBook.this,uri.toString(), Toast.LENGTH_LONG).show();
           }
       });*/

       /* try {
            url= URLEncoder.encode(url,"UTF-8");
            webView.loadUrl(test+url);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/

       // webView.loadUrl(test+url);

        //loadWebUrl(fire2);





       /*ref.getMetadata().addOnSuccessListener(new OnSuccessListener<StorageMetadata>() {
           @Override
           public void onSuccess(StorageMetadata storageMetadata) {
               String url=storageMetadata.getPath();
               webView.loadUrl(url);
               Toast.makeText(ShowBook.this,url, Toast.LENGTH_LONG).show();
           }
       });*/


        /*Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse(url),"application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Intent newIntent=Intent.createChooser(intent,"Open File");
        try{
            startActivity(newIntent);
        }catch(ActivityNotFoundException e){
        }*/










    }

    /*private void loadWebUrl(String url) {
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webView.getSettings().setBuiltInZoomControls(true);
        if (url!=null&&!url.isEmpty()) {
            try {
                url= URLEncoder.encode(url,"UTF-8");
                webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+url);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }else {
            Toast.makeText(this, "Can't show right now,\nPlease try again later!", Toast.LENGTH_SHORT).show();
        }


    }*/

    public void openWebPage(String url){
        Uri webPage=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,webPage);
        if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
}
/*
* Types of geomety manager
* 1.grid
* 2.pack
* 3.place*/