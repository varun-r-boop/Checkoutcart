package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nullable;

import static com.example.firebase.Constants.ERROR_DIALOG_REQUEST;
import static com.example.firebase.Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION;
import static com.example.firebase.Constants.PERMISSIONS_REQUEST_ENABLE_GPS;

public class workerslogin extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private ProgressBar mProgressBar;
    EditText editTextuser, editTextpswd;
    private static final String TAG = "workerslogin";
    Button login;
    private boolean mLocationPermissionGranted = false;
    private FirebaseFirestore mDb;
    private FusedLocationProviderClient mFusedLocationProviderClient;
    private UserLocation mUserLocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workerslogin);


        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        mAuth = FirebaseAuth.getInstance();
        mDb = FirebaseFirestore.getInstance();

        editTextuser = findViewById(R.id.editTextTextEmailAddress);
        editTextpswd = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.button4);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editTextuser.getText().toString().trim();
                String password = editTextpswd.getText().toString().trim();

                if (email.isEmpty()) {
                    editTextuser.setError("Please Enter Email");
                    editTextuser.requestFocus();
                    return;
                }

                if (password.isEmpty()) {
                    editTextpswd.setError("Please Enter Password");
                    editTextpswd.requestFocus();
                    return;
                }

                if (password.length() < 6) {
                    editTextpswd.setError("Please Enter a Valid Password");
                    editTextpswd.requestFocus();
                    return;

                }
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(workerslogin.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    startActivity(new Intent(getApplicationContext(), com.example.firebase.login.class));
                                } else {
                                    Toast.makeText(getApplicationContext(),
                                            "Incorrect Code", Toast.LENGTH_LONG) .show();
                                }

                                // ...
                            }
                        });



            }


        });
    }



}


