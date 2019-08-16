package com.adame.myappformes;

public class Forme {
        private String nom;
        private double valeur1;
        private double valeur2;
        private double valeur3;

        public Forme() {
        }

        public Forme(double v1) {
            valeur1 = v1;
        }

        public Forme(double v1, double v2) {
            valeur1 = v1;
            valeur2 = v2;
        }

        public Forme(double v1, double v2, double v3) {
            valeur1 = v1;
            valeur2 = v2;
            valeur3 = v3;
        }

        public double getSuperficieTriangle(double base, double hauteur) {
            double sup = (base * hauteur / 2);
            return Utilitaire.round(sup, 2);
        }

        public double getSuperficieRectangleangle(double larguer, double hauteur) {
            double sup = larguer * hauteur;
            return Utilitaire.round(sup, 2);
        }

        public double getSuperficieTrapezoide(double base1, double base2, double hauteur) {
            if (hauteur == 0) {
                return 0;
            }
            double sup = (base1 + base2) / 2 * hauteur;
            return Utilitaire.round(sup, 2);
        }

        public double getSupEllipse(double a, double b) {
            double sup = Math.PI * a * b;
            return Utilitaire.round(sup, 2);
        }

        public double getSupCarre(double a) {
            double sup = Math.pow(a, 2);
            return Utilitaire.round(sup, 2);
        }

        public double getSupParallelogramme(double b, double h) {
            double sup = b * h;
            return Utilitaire.round(sup, 2);
        }

        public double getSupCercle(double rayon) {
            double sup = Math.PI * (Math.pow(rayon, 2));
            return Utilitaire.round(sup, 2);
        }

        public double getSupSecteur(double r, double angle) {
            double sup = (Math.pow(r, 2) * angle) / 2;
            return Utilitaire.round(sup, 2);
        }
}
