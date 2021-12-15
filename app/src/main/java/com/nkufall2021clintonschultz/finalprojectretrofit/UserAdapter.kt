package com.example.com.nkufall2021clintonschultz.finalprojectretrofit

import android.content.Intent
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nkufall2021clintonschultz.finalprojectretrofit.R
import com.nkufall2021clintonschultz.finalprojectretrofit.SecondActivity
import kotlinx.android.synthetic.main.user_row.view.*

class UserAdapter(private val users: List<User>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)
        val holder = ViewHolder(view)
        view.setOnClickListener {
            val intent = Intent(parent.context, SecondActivity::class.java)
            val content = "\n   Name: " + users[holder.adapterPosition].name + "\n\n   Username: " +
                    users[holder.adapterPosition].username + "\n\n   Email: " +
                    users[holder.adapterPosition].email + "\n\n   Phone: " +
                    users[holder.adapterPosition].phone + "\n\n   Website: " +
                    users[holder.adapterPosition].website

            intent.putExtra("name", content)
            parent.context.startActivity(intent)

        }
        return holder
    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        d("clintonS", "email? ${user.email}")
        holder.username.text = user.username
        holder.name.text = user.name
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val username: TextView = itemView.usernametv
        val name: TextView = itemView.name
    }
}
