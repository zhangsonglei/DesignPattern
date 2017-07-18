package com.sonly.memento;

/**
 *<ul>
 *<li>Description:  游戏角色,发起者
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public class GameRoleOriginator {
	
	private int vita;    // 生命值
	private int attack;    // 攻击力
	private int defense;    // 防御力
	 
	public GameRoleOriginator(int vita, int attack, int defense) {
		this.vita = vita;
		this.attack = attack;
		this.defense = defense;
	}

	public int getVita() {
		return vita;
	}

	public void setVita(int vita) {
		this.vita = vita;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	 
	public void fight() {
		vita -= 10;
		attack -= 10;
		defense += 10;
	}
	
	public RoleStateMemeto save() {
		return new RoleStateMemeto(vita, attack, defense);
	}
	
	public void recover(RoleStateMemeto memeto) {
		this.vita = memeto.getVita();
		this.attack = memeto.getAttack();
		this.defense = memeto.getDefense();
	}
	
	@Override
	public String toString() {
		return "Vita:"+vita+"\tattack:"+attack+"\tdefense:"+defense;
	}
}
