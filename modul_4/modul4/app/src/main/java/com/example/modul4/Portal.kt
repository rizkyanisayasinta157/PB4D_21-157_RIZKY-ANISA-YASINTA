package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Portal.newInstance] factory method to
 * create an instance of this fragment.
 */
class Portal : Fragment() {

    lateinit var contentNama: String
    lateinit var contentNim: String
    lateinit var contentProdi: String

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contentNama = arguments?.getString("keyNama").toString()
        contentNim = arguments?.getString("keyNim").toString()
        contentProdi = arguments?.getString("keyProdi").toString()

        val tnama = view.findViewById<TextView>(R.id.textnama)
        val tnim = view.findViewById<TextView>(R.id.textnim)
        val tprodi = view.findViewById<TextView>(R.id.textprodi)
        val btnportal = view.findViewById<Button>(R.id.btn1)

        tnama.text = "$contentNama"
        tnim.text = "$contentNim"
        tprodi.text = "$contentProdi"

        btnportal.setOnClickListener {
            findNavController().navigate(R.id.action_portal_to_home2)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Portal.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Portal().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}