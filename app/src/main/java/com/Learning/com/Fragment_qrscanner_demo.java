package com.Learning.com;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.blikoon.qrcodescanner.QrCodeActivity;

public class Fragment_qrscanner_demo  extends Fragment {
    Button btnScanBarcode;
    int CAMERA_PERMISSION_CODE=24;
    private static final int REQUEST_CODE_QR_SCAN=101;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_qrscanner_demo, container, false);
        btnScanBarcode=(Button)view.findViewById(R.id.btnScanBarcode);
        btnScanBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(canOpenCamera()){
                    openCamera();
                }else {
                    requestCameraPermission();
                }

            }
        });
    return view;
    }
    private void openCamera(){
        Intent intent=new Intent(getActivity(), QrCodeActivity.class);
        startActivityForResult(intent,REQUEST_CODE_QR_SCAN);
    }
    private boolean canOpenCamera(){
        int result= ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA);
        if(result== PackageManager.PERMISSION_GRANTED){
            return true;
        }
        return false;
    }
    private void requestCameraPermission(){
        if(ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), Manifest.permission.CAMERA)){
            Toast.makeText(getActivity(), "Accept Permission to open camera", Toast.LENGTH_SHORT).show();
        }
        ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.CAMERA},CAMERA_PERMISSION_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode==CAMERA_PERMISSION_CODE){
            if(grantResults.length>0&&grantResults[0]== PackageManager.PERMISSION_GRANTED){
                openCamera();
            }else {
                Toast.makeText(getActivity(), "User Denied Permisssion", Toast.LENGTH_SHORT).show();
            }
        }

    }
    public void onActivityResult(int req_code, int resultcode, Intent data){
        if(resultcode!= Activity.RESULT_OK){
            if(data==null){
                return;
            }
            String result=data.getStringExtra("com.blikoon.qrcodescanner.error_decoding_image");
            if(result!=null){
                AlertDialog alertDialog=new AlertDialog.Builder(getActivity()).create();
                alertDialog.setTitle("Scan Error");;
                alertDialog.setMessage("QR couldn't able to scan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
            return;
        }
        if(req_code==REQUEST_CODE_QR_SCAN){
            if(data==null)
                return;
            String result=data.getStringExtra("com.blikoon.qrcodescanner.got_qr_scan_relult");

            AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
            alertDialog.setTitle("Scan Result");
            alertDialog.setMessage(result);
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }
    }
}

