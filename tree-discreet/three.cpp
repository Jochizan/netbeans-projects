#include <iostream>
#include <conio.h>
using namespace std;
struct nodo {
  int valor;
  struct nodo *izq;
  struct nodo *der;
};
typedef struct nodo *ABB;
void inserta(ABB &,int);
void preorden(ABB);
void postorden(ABB);
void enorden(ABB);
void verArbol(ABB,int);

int main()
{
  ABB arbol=NULL;
  int n,x;
  cout<<"Cantidad de elementos del arbol: ";
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<"Ingrese nodo numero"<<i<<": ";
    cin>>x;
    inserta(arbol,x);
  }
  verArbol(arbol,0);
  cout<<endl<<"Preorden: "; preorden(arbol);
  cout<<endl<<"postorden: "; postorden(arbol);
  cout<<endl<<"Enorden: "; enorden(arbol);
}

void inserta(ABB &arbol,int x)
{
  if(arbol==NULL)
  {
    arbol=new(struct nodo);
    arbol->valor=x;
    arbol->izq=NULL;
    arbol->der=NULL;
  }
  else if(x<arbol->valor)inserta(arbol->izq,x);
  else if(x>arbol->valor)inserta(arbol->der,x);
} //si es igual no se inserta
void preorden(ABB arbol)
{
  if(arbol!=NULL)
  {
    cout<<arbol->valor<<" ";
    preorden(arbol->izq);
    preorden(arbol->der);
  }
}
void enorden(ABB arbol)
{
  if(arbol!=NULL)
  {
    enorden(arbol->izq);
    cout<<arbol->valor<<" ";
    enorden(arbol->der);
  }
}
void postorden(ABB arbol)
{
  if(arbol!=NULL)
  {
    postorden(arbol->izq);
    postorden(arbol->der);
    cout<<arbol->valor<<" ";
  }
}

void verArbol(ABB arbol,int nro)
{
  int i;
  if(arbol==NULL)return;
  verArbol(arbol->der,nro+1);
  for(i=0;i<nro;i++)cout<<" ";
  cout<<arbol->valor<<endl;
  verArbol(arbol->izq,nro+1);
}
