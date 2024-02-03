package com.example.dribbble1

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SignIn() {
    Surface (modifier=Modifier.fillMaxSize()){
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            TopPart()
            Spacer(modifier = Modifier.height(20.dp))
            Column (modifier= Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally){
                OutlinedTextField(value = "",
                    onValueChange ={},
                    modifier=Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Email")
                    },
                    shape= RoundedCornerShape(10.dp)
                )
                OutlinedTextField(value = "",
                    onValueChange = {},
                    modifier=Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Password")
                    },
                    shape=RoundedCornerShape(10.dp))
                Row (modifier=Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End){
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "Forgot Password", fontSize = 16.sp)

                }


                    
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = { /*TODO*/ },
                    modifier= Modifier
                        .fillMaxWidth()
                        .height(50.dp)) {
                    Text(text = "Sign In")

                }
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Divider(modifier= Modifier
                        .fillMaxWidth(0.5f)
                        .padding(top = 4.dp),
                        thickness = 3.dp)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Or",
                        fontSize = 15.sp)
                    Spacer(modifier = Modifier.width(10.dp))
                    Divider(modifier= Modifier
                        .padding(top = 4.dp),
                        thickness = 3.dp)


                }
                Spacer(modifier = Modifier.height(30.dp))
                Row {
                    Icon(painter = painterResource(id = R.drawable.google),
                        contentDescription = "null",
                        modifier= Modifier
                            .size(40.dp)
                            .background(color = Color.White, shape = RectangleShape)
                            .border(width = 1.dp, color = Color.Blue),
                        Color.Blue

                    )
                    Spacer(modifier =Modifier.width(20.dp) )

                   Icon(painter = painterResource(id = R.drawable.facebook),
                       contentDescription = "null",
                       modifier= Modifier
                           .size(40.dp)
                           .background(color = Color.White, shape = RectangleShape)
                           .border(width = 1.dp, color = Color.Blue),
                       Color.Blue
                   )
                    Spacer(modifier =Modifier.width(20.dp) )
                    Icon(painter = painterResource(id = R.drawable.linked),
                        contentDescription ="null",
                        modifier= Modifier
                            .size(40.dp)
                            .background(color = Color.White, shape = RectangleShape)
                            .border(width = 1.dp, color = Color.Blue),
                        Color.Blue
                        )

                }
                Spacer(modifier = Modifier.height(50.dp))

                Row {
                    Text(text = "Don't have an account, ",
                        modifier=Modifier.padding(top=14.dp),
                        )
                    TextButton(onClick = {  }) {
                        Text(text = "Sign Up",modifier=Modifier)
                        
                    }
                }





            }

        }

    }
    
}

@Composable
private fun TopPart() {
    Box(
        modifier = Modifier
            .fillMaxHeight(0.37f)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.shape),
            contentDescription = "null",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Image(
                painter = painterResource(id = R.drawable.boy),
                contentDescription = "null",
                modifier = Modifier
                    .size(150.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Sign In",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

        }


    }
}
