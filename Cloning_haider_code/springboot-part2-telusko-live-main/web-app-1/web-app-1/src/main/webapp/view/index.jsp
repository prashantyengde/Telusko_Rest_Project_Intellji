<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Telusko DevOps with AWS Learning</title>
    <!-- Load Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }
    </style>
</head>
<body class="bg-gray-50 min-h-screen">

    <!-- Header / Navigation Bar -->
    <header class="bg-white shadow-md">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-4 flex justify-between items-center">
            <h1 class="text-2xl font-extrabold text-indigo-700 tracking-tight">
                Telusko Learning
            </h1>
            <nav class="space-x-6 flex items-center">
                <a href="#course-details" class="text-gray-600 hover:text-indigo-600 font-medium transition duration-150 ease-in-out">Course Details</a>
                <a href="https://telusko.com" target="_blank" class="text-indigo-600 hover:text-indigo-800 font-semibold transition duration-150 ease-in-out border-b-2 border-indigo-600 pb-1">Visit telusko.com</a>
            </nav>
        </div>
    </header>
    
    <!-- Courses Offered Banner -->
    <div class="bg-indigo-100 border-b-4 border-indigo-600 py-3 text-center shadow-inner">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
            <p class="text-indigo-800 font-semibold text-sm sm:text-base">
                Courses We Offer:
                <span class="font-normal text-indigo-700 ml-2">Cloud DevOps • Java • Spring Boot • AI Engineering</span>
            </p>
        </div>
    </div>
    
    <!-- Marquee -->
    <h1 class="text-center bg-yellow-400 text-indigo-900 py-2 text-xl font-bold uppercase shadow-lg">
        <marquee behavior="scroll" direction="left">
            <%= request.getAttribute("message") != null ? request.getAttribute("message") : "Welcome to Telusko DevOps with AWS Learning!" %>
        </marquee>
    </h1>

    <!-- Hero Section -->
    <main class="py-12 md:py-20">
        <div class="max-w-4xl mx-auto px-4 sm:px-6 lg:px-8 text-center">
            <div class="bg-indigo-700 text-white p-8 md:p-12 rounded-2xl shadow-xl">
                <p class="text-indigo-200 text-sm uppercase font-semibold mb-2">Master Modern Infrastructure</p>
                <h2 class="text-4xl sm:text-5xl md:text-6xl font-black mb-6 leading-tight">
                    Telusko DevOps with AWS Learning
                </h2>
                <p class="text-indigo-200 text-xl font-light mb-8 max-w-2xl mx-auto">
                    A comprehensive, hands-on program designed to transform you into an expert DevOps engineer utilizing the power of Amazon Web Services.
                </p>
                <a href="#" class="inline-block bg-yellow-400 text-indigo-900 font-bold py-3 px-8 rounded-full shadow-lg hover:bg-yellow-300 transition duration-300 transform hover:scale-105">
                    Enroll Now
                </a>
            </div>
        </div>
    
        <!-- Program Highlights -->
        <section id="course-details" class="max-w-5xl mx-auto px-4 sm:px-6 lg:px-8 mt-12 md:mt-16">
            <h3 class="text-3xl font-bold text-gray-800 text-center mb-8">Program Highlights</h3>
            
            <div class="grid md:grid-cols-2 gap-8">
                
                <!-- Duration -->
                <div class="bg-white p-6 md:p-8 rounded-xl shadow-lg border-t-4 border-indigo-500 hover:shadow-xl transition duration-300">
                    <div class="flex items-center space-x-4">
                        <svg class="w-10 h-10 text-indigo-600" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                        </svg>
                        <div>
                            <p class="text-sm font-medium text-gray-500">Course Commitment</p>
                            <p class="text-2xl font-bold text-gray-900">4 Months</p>
                        </div>
                    </div>
                    <p class="text-gray-600 mt-4 text-sm">A focused, deep-dive curriculum covering essential tools from CI/CD to Infrastructure as Code.</p>
                </div>
    
                <!-- Instructor -->
                <div class="bg-white p-6 md:p-8 rounded-xl shadow-lg border-t-4 border-indigo-500 hover:shadow-xl transition duration-300">
                    <div class="flex items-center space-x-4">
                        <div class="w-10 h-10 bg-indigo-100 rounded-full flex items-center justify-center">
                            <svg class="w-6 h-6 text-indigo-600" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5.121 17.804A13.937 13.937 0 0112 16c2.5 0 4.847.655 6.879 1.804M15 10a3 3 0 11-6 0 3 3 0 016 0zm6 0a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                            </svg>
                        </div>
                        <div>
                            <p class="text-sm font-medium text-gray-500">Lead Instructor</p>
                            <p class="text-2xl font-bold text-gray-900">Hyder Abbas</p>
                        </div>
                    </div>
                    <p class="text-gray-600 mt-4 text-sm">Learn from an industry veteran with extensive experience in cloud architecture and scalable DevOps pipelines.</p>
                </div>
            </div>
        </section>

        <!-- Features -->
        <section class="max-w-5xl mx-auto px-4 sm:px-6 lg:px-8 mt-16 text-center">
            <h3 class="text-3xl font-bold text-gray-800 mb-6">What You Will Master</h3>
            <div class="grid sm:grid-cols-2 lg:grid-cols-4 gap-6 text-left">
                <div class="bg-white p-5 rounded-lg shadow-md">
                    <span class="text-indigo-600 font-bold">1.</span> CI/CD with Jenkins & GitLab
                </div>
                <div class="bg-white p-5 rounded-lg shadow-md">
                    <span class="text-indigo-600 font-bold">2.</span> Docker & Kubernetes Orchestration
                </div>
                <div class="bg-white p-5 rounded-lg shadow-md">
                    <span class="text-indigo-600 font-bold">3.</span> AWS Services (EC2, S3, RDS)
                </div>
                <div class="bg-white p-5 rounded-lg shadow-md">
                    <span class="text-indigo-600 font-bold">4.</span> Infrastructure as Code (Terraform)
                </div>
            </div>
        </section>
    </main>

    <!-- Footer -->
    <footer class="bg-gray-800 mt-12">
        <div class="max-w-7xl mx-auto py-6 px-4 sm:px-6 lg:px-8 text-center text-gray-400">
            &copy; 2025 Telusko Learning. All rights reserved.
        </div>
    </footer>

</body>
</html>
