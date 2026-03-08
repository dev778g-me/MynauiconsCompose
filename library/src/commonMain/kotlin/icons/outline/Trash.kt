package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Trash: ImageVector
    get() {
        if (_Trash != null) {
            return _Trash!!
        }
        _Trash = ImageVector.Builder(
            name = "Outline.Trash",
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
                moveToRelative(18f, 9f)
                lineToRelative(-0.84f, 8.398f)
                curveToRelative(-0.127f, 1.273f, -0.19f, 1.909f, -0.48f, 2.39f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.075f, 0.973f)
                curveTo(15.098f, 21f, 14.46f, 21f, 13.18f, 21f)
                horizontalLineToRelative(-2.36f)
                curveToRelative(-1.279f, 0f, -1.918f, 0f, -2.425f, -0.24f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.076f, -0.973f)
                curveToRelative(-0.288f, -0.48f, -0.352f, -1.116f, -0.48f, -2.389f)
                lineTo(6f, 9f)
                moveToRelative(7.5f, 6.5f)
                verticalLineToRelative(-5f)
                moveToRelative(-3f, 5f)
                verticalLineToRelative(-5f)
                moveToRelative(-6f, -4f)
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

        return _Trash!!
    }

@Suppress("ObjectPropertyName")
private var _Trash: ImageVector? = null
