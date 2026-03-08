package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BellHome: ImageVector
    get() {
        if (_BellHome != null) {
            return _BellHome!!
        }
        _BellHome = ImageVector.Builder(
            name = "Outline.BellHome",
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
                moveTo(15.019f, 17f)
                horizontalLineToRelative(-6.04f)
                moveToRelative(6.04f, 0f)
                horizontalLineToRelative(3.614f)
                curveToRelative(1.876f, 0f, 1.559f, -1.86f, 0.61f, -2.804f)
                curveTo(15.825f, 10.801f, 20.68f, 3f, 11.999f, 3f)
                reflectiveCurveToRelative(-3.825f, 7.8f, -7.243f, 11.196f)
                curveToRelative(-0.913f, 0.908f, -1.302f, 2.804f, 0.61f, 2.804f)
                horizontalLineTo(8.98f)
                moveToRelative(6.039f, 0f)
                curveToRelative(0f, 1.925f, -0.648f, 4f, -3.02f, 4f)
                reflectiveCurveToRelative(-3.02f, -2.075f, -3.02f, -4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.75f, 12.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(9.14f)
                lineTo(12f, 7.5f)
                lineToRelative(2.25f, 1.64f)
                verticalLineToRelative(2.36f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
            }
        }.build()

        return _BellHome!!
    }

@Suppress("ObjectPropertyName")
private var _BellHome: ImageVector? = null
