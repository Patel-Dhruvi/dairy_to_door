package com.example.dhruvi.project;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class help extends AppCompatActivity {
    TextView txtshopping,txttracking,txtpayment,txtcancel,txtreplacement,txtreturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        txtshopping=(TextView)findViewById(R.id.txtshopping);
        txttracking=(TextView)findViewById(R.id.txttracking);
        txtpayment=(TextView)findViewById(R.id.txtpayment);
        txtcancel=(TextView)findViewById(R.id.txtcancel);
        txtreplacement=(TextView)findViewById(R.id.txtreplacement);
        txtreturn=(TextView)findViewById(R.id.txtreturn);


        txtshopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder=new AlertDialog.Builder(help.this);
                builder.setCancelable(false);
                builder.setTitle("Shipping and Delivery");
                builder.setMessage("All the orders are delivered as per the time slot you have selected while placing the order.However,if the products are not delivered by the promised time please call us.We will be happy to help you with the delivery.During the offer period some orders may take longer for delivery.We will notify you when your order shipped.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


                TextView textView = ((TextView) alertDialog.findViewById(android.R.id.message));
                textView.getInputType();
                textView.setTextColor(Color.DKGRAY);
                textView.setTextSize(17);
//               textView.setPadding(25, 20, 20, 20);

            }

        });

        txttracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(help.this);
                builder.setCancelable(false);
                builder.setTitle("Tracking Your Package");
                builder.setMessage("You can track your package via your mesaagebox.you will also receive automated SMSes on the registered phone number once you have placed an order.Moreover,you can also call us to know the current status of the order. ");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


                TextView textView = ((TextView) alertDialog.findViewById(android.R.id.message));
                textView.getInputType();
                textView.setTextColor(Color.DKGRAY);
                textView.setTextSize(17);
//                textView.setPadding(25, 20, 20, 20);


            }
        });

        txtpayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(help.this);
                builder.setCancelable(false);
                builder.setTitle("Payments");
                builder.setMessage("This Application offers you COD mode method.COD refers to Cash On Delivery.You can pay in cash at the time of product delivery at your doorstep.This is strictly a cash-only payment method.Only Indian Rupees accepted. ");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


                TextView textView = ((TextView) alertDialog.findViewById(android.R.id.message));
                textView.getInputType();
                textView.setTextColor(Color.DKGRAY);
                textView.setTextSize(17);
//                textView.setPadding(25, 20, 20, 20);


            }
        });

        txtcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(help.this);
                builder.setCancelable(false);
                builder.setTitle("Cancellations");
                builder.setMessage("For cancellation of order,please contact our Customer Support team at morning and let us know the reason for it.Our Subject Matter Experts will review the reason for your cancellation request and try to resolve the objective if possible.if you still do not wish to continue with your order,we'll cancel it. ");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


                TextView textView = ((TextView) alertDialog.findViewById(android.R.id.message));
                textView.getInputType();
                textView.setTextColor(Color.DKGRAY);
                textView.setTextSize(17);
//                textView.setPadding(25, 20, 20, 20);


            }
        });

        txtreplacement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(help.this);
                builder.setCancelable(false);
                builder.setTitle("Easy Replacement");
                builder.setMessage("All products sold on this application are checked and verified before delivery.We offer replacement for all products,under some situation.Like,In case of any contaminated/Spoled product,customer may notigy us before the commencement of the next delivery time slot.");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


                TextView textView = ((TextView) alertDialog.findViewById(android.R.id.message));
                textView.getInputType();
                textView.setTextColor(Color.DKGRAY);
                textView.setTextSize(17);
//                textView.setPadding(25, 20, 20, 20);


            }
        });

        txtreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(help.this);
                builder.setCancelable(false);
                builder.setTitle("Return Of Products By You");
                builder.setMessage("We encourage to thoroughly check the product before accepting delivery.However,in case of transit damages or Expired products,the issue has to be reported immediately at the time of delivery.After which we may not be able to accept the complaint.whenever you return the product,Products must be in their original conditon.Only unused,unaltered,unsoiled products will be accepted.  ");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


                TextView textView = ((TextView) alertDialog.findViewById(android.R.id.message));
                textView.getInputType();
                textView.setTextColor(Color.DKGRAY);
                textView.setTextSize(17);
//             textView.setPadding(20,20, 20, 20);


            }
        });


    }
}
