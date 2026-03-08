package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TrashOne: ImageVector
    get() {
        if (_TrashOne != null) {
            return _TrashOne!!
        }
        _TrashOne = ImageVector.Builder(
            name = "Outline.TrashOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(18f, 7f)
                lineToRelative(-0.886f, 10.342f)
                curveToRelative(-0.111f, 1.29f, -0.166f, 1.936f, -0.453f, 2.424f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.078f, 0.99f)
                curveToRelative(-0.511f, 0.244f, -1.16f, 0.244f, -2.455f, 0.244f)
                horizontalLineToRelative(-2.256f)
                curveToRelative(-1.296f, 0f, -1.944f, 0f, -2.455f, -0.244f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.078f, -0.99f)
                curveToRelative(-0.287f, -0.488f, -0.342f, -1.134f, -0.453f, -2.424f)
                lineTo(6f, 7f)
                moveToRelative(-1.5f, -0.5f)
                horizontalLineToRelative(4.615f)
                moveToRelative(0f, 0f)
                lineToRelative(0.386f, -2.672f)
                curveToRelative(0.112f, -0.486f, 0.516f, -0.828f, 0.98f, -0.828f)
                horizontalLineToRelative(3.038f)
                curveToRelative(0.464f, 0f, 0.867f, 0.342f, 0.98f, 0.828f)
                lineToRelative(0.386f, 2.672f)
                moveToRelative(-5.77f, 0f)
                horizontalLineToRelative(5.77f)
                moveToRelative(0f, 0f)
                horizontalLineTo(19.5f)
            }
        }.build()

        return _TrashOne!!
    }

@Suppress("ObjectPropertyName")
private var _TrashOne: ImageVector? = null
