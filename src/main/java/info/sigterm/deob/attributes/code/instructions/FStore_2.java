package info.sigterm.deob.attributes.code.instructions;

import info.sigterm.deob.attributes.code.Instruction;
import info.sigterm.deob.attributes.code.InstructionType;
import info.sigterm.deob.attributes.code.Instructions;
import info.sigterm.deob.attributes.code.instruction.types.LVTInstruction;
import info.sigterm.deob.execution.Frame;

import java.io.IOException;

public class FStore_2 extends Instruction implements LVTInstruction
{
	public FStore_2(Instructions instructions, InstructionType type, int pc) throws IOException
	{
		super(instructions, type, pc);
	}

	@Override
	public void execute(Frame frame)
	{
		Object obj = frame.getStack().pop();
		assert obj instanceof Float;
		frame.getVariables().set(2, obj);
	}
	
	@Override
	public int getVariableIndex()
	{
		return 2;
	}

	@Override
	public boolean store()
	{
		return true;
	}
}
