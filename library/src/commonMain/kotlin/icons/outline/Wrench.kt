package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Wrench: ImageVector
    get() {
        if (_Wrench != null) {
            return _Wrench!!
        }
        _Wrench = ImageVector.Builder(
            name = "Outline.Wrench",
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
                moveTo(9.917f, 7.076f)
                arcToRelative(0.947f, 0.947f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.326f)
                lineTo(8.402f, 9.917f)
                arcToRelative(0.947f, 0.947f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.326f, 0f)
                lineTo(4.528f, 7.37f)
                curveToRelative(-0.495f, -0.494f, -1.327f, -0.333f, -1.446f, 0.356f)
                arcToRelative(5.682f, 5.682f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.626f, 6.554f)
                curveToRelative(0.82f, -0.15f, 1.707f, -0.022f, 2.296f, 0.566f)
                lineToRelative(5.566f, 5.567f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.842f, -2.842f)
                lineToRelative(-5.567f, -5.566f)
                curveToRelative(-0.588f, -0.589f, -0.716f, -1.477f, -0.566f, -2.296f)
                arcToRelative(5.684f, 5.684f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.554f, -6.626f)
                curveToRelative(-0.689f, 0.12f, -0.85f, 0.951f, -0.356f, 1.446f)
                close()
            }
        }.build()

        return _Wrench!!
    }

@Suppress("ObjectPropertyName")
private var _Wrench: ImageVector? = null
