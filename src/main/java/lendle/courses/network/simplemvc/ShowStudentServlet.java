/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.simplemvc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 70636
 */
@WebServlet(name = "ShowStudentServlet", urlPatterns = {"/ShowStudentServlet"})
public class ShowStudentServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id=request.getParameter("id");
        Student student=Student.getStudent(id);
        String address=null;
//        request.setAttribute("student", student);
        if(student==null){
            request.setAttribute("student", student);
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/score-report/UnknownStudent.jsp");
            rd.forward(request, response);
        }else if(student.getScore()<60){
            request.setAttribute("student", student);
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/score-report/LowScore.jsp");
            rd.forward(request, response);
            //內轉址
//            request.setAttribute("student", student);
//            RequestDispatcher rd=request.getRequestDispatcher("/bank-account/NegativeBalance.jsp");
//            rd.forward(request, response);
            //外轉址
//            response.sendRedirect("bank-account/NegativeBalance.jsp");
        }else if(student.getScore()>70){
            request.setAttribute("student", student);
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/score-report/HighScore.jsp");
            rd.forward(request, response);
        }else{
            request.setAttribute("student", student);
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/score-report/NormalScore.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
