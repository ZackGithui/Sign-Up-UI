package com.example.dribbble1

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp() {
    Surface {
        Column(modifier=Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            TopSection()
            Column(modifier= Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                var text by remember {
                    mutableStateOf("")
                }
              OutlinedTextField(value = text,
                  onValueChange = {it->
              text=it},
                  modifier=Modifier.fillMaxWidth(),
                  label = {
                      Text(text = "Email")
                  },
                  shape = RoundedCornerShape(10.dp),
                  colors = TextFieldDefaults.outlinedTextFieldColors(Color.Cyan)


                  )
                Row {
                    OutlinedTextField(value = "", 
                        onValueChange = {},
                        modifier=Modifier.fillMaxWidth(0.5f),
                        label = {
                            Text(text = "First Name")
                        },
                        shape = RoundedCornerShape(10.dp))

                    Spacer(modifier = Modifier.width(10.dp))

                    OutlinedTextField(value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Last Name")
                        },
                        shape = RoundedCornerShape(10.dp),)

                }
                OutlinedTextField(value = "",
                    onValueChange ={},
                    label={ Text(text = "Password")},
                    modifier=Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(10.dp)
                )
                OutlinedTextField(value = "",
                    onValueChange ={},
                    label={ Text(text = "Confirm Password")},
                    modifier=Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(10.dp)
                )
                Spacer(modifier = Modifier.height(70.dp))
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth(),
                        ) {
                    Text(text = "Create Account",modifier=Modifier.padding(top = 10.dp,bottom=10.dp))
                    
                }
                Spacer(modifier = Modifier.height(30.dp))
               Row {
                   Text(text = "Already have an account,",modifier=Modifier.padding(top = 15.dp))
                   TextButton(onClick = { /*TODO*/ }) {
                       Text(text = "Login",)
                       
                   }
               }


            }

        }

    }

}

@Composable
private fun TopSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(fraction = 0.37f),
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painter = painterResource(id = R.drawable.shape), contentDescription = "null",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 30.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sign Up",
                fontSize = 30.sp,
                fontWeight = FontWeight.Medium
            )
        }

    }
}
