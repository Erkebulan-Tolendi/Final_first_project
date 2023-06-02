package kz.example.finalproject.ui.gallery;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import kz.example.finalproject.R;
import kz.example.finalproject.TestAna;
import kz.example.finalproject.TestPar;
import kz.example.finalproject.TestParApa;

public class GalleryFragment extends Fragment {

    View view;
    Activity context;
    Button btn_test_apa, btn_wp, btn_telegram,btn_instagram, btn_call, btn_sms;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();
        view = inflater.inflate(R.layout.fragment_apa, container, false);

        btn_wp = (Button) view.findViewById(R.id.btn_wp);
        btn_telegram = (Button) view.findViewById(R.id.btn_telegram);
        btn_instagram = (Button) view.findViewById(R.id.btn_instagram);
        btn_call = view.findViewById(R.id.btn_call);
        btn_sms = view.findViewById(R.id.btn_sms);

        btn_wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.whatsapp.com/");
            }
        });

        btn_telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://web.telegram.org/k/");
            }
        });

        btn_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/");
            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" ));
                startActivity(intent);
            }
        });

        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:" );
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello you are welcome to project");
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        btn_test_apa = (Button) context.findViewById(R.id.btn_test_apa);
        btn_test_apa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (context, TestParApa.class);
                startActivity(intent);
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}