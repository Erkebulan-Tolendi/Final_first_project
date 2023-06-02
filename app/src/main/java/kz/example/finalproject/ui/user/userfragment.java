package kz.example.finalproject.ui.user;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import kz.example.finalproject.R;
import kz.example.finalproject.TestPar;


public class userfragment extends Fragment {
    View view;
    TextView userName, userEmail, phoneNumber;
    String at;
    Button btn_call, btn_sms;
    ImageView user_image;
    Activity context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.user_fragment, container, false);

        phoneNumber = view.findViewById(R.id.phoneNumber);
        userName = view.findViewById(R.id.userName);
        userEmail = view.findViewById(R.id.userEmail);
        user_image = view.findViewById(R.id.user_image);
        btn_call = view.findViewById(R.id.btn_call);
        btn_sms = view.findViewById(R.id.btn_sms);



        Glide.with(this)
                .load("https://images.pexels.com/photos/4307869/pexels-photo-4307869.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")
                .centerCrop()
                .placeholder(R.drawable.baseline_account_box_24)
                .into(user_image);

        Intent intent = getActivity().getIntent();
        String uEmail = intent.getStringExtra("email");
        String uName = intent.getStringExtra("name");

        userEmail.setText( uEmail);
        userName.setText( uName);

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber.getText()));
                startActivity(intent);
            }
        });

        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:" + phoneNumber.getText());
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello you are welcome to project");
                startActivity(intent);
            }
        });

        return view;
    }


}