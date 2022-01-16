package com.example.firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookingTimeAdapter extends RecyclerView.Adapter<BookingTimeAdapter.ViewHolder> {


    ArrayList<BookingTime> bookingTimes;
    Context context;
    private static BookingTime selectedTime;

    public BookingTimeAdapter(ArrayList<BookingTime> bookingTimes, Context context) {
        this.bookingTimes = bookingTimes;
        this.context = context;
    }

    @NonNull
    @Override
    public BookingTimeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View listItem= layoutInflater.inflate(R.layout.booking_time_layout, viewGroup, false);
        BookingTimeAdapter.ViewHolder viewHolder = new BookingTimeAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookingTimeAdapter.ViewHolder viewHolder, int i) {
        BookingTime bookingTime = bookingTimes.get(i);
        viewHolder.bookingTimeButton.setText(bookingTime.getTime());

        if(bookingTime.getSelected()){
            viewHolder.bookingTimeButton.setBackground(ContextCompat.getDrawable(context,R.drawable.fui_idp_button_background_anonymous));
            viewHolder.bookingTimeButton.setTextColor(ContextCompat.getColor(context,R.color.colorWhite));
        }else{
            viewHolder.bookingTimeButton.setBackground(ContextCompat.getDrawable(context,R.drawable.fui_idp_button_background_apple));
            viewHolder.bookingTimeButton.setTextColor(ContextCompat.getColor(context,R.color.colorAccent));
        }
    }

    @Override
    public int getItemCount() {
        return bookingTimes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public Button bookingTimeButton;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            bookingTimeButton = (Button) itemView.findViewById(R.id.booking_time_button);
            bookingTimeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    {
                        int itemPosition = getAdapterPosition();
                        BookingTime bookingTime = bookingTimes.get(itemPosition);

                        if(bookingTime.getSelected()){
                            if(selectedTime!=null)
                                selectedTime.setSelected(true);
                            bookingTime.setSelected(false);
                        }else {
                            if(selectedTime!=null)
                                selectedTime.setSelected(false);
                            bookingTime.setSelected(true);
                        }

                        selectedTime = bookingTime;
                        notifyDataSetChanged();

                    }
                }
            });
        }
    }
}

