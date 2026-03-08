package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowBigLeft: ImageVector
    get() {
        if (_ArrowBigLeft != null) {
            return _ArrowBigLeft!!
        }
        _ArrowBigLeft = ImageVector.Builder(
            name = "Outline.ArrowBigLeft",
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
                moveTo(10.895f, 4.483f)
                curveToRelative(0f, -0.43f, -0.545f, -0.645f, -0.863f, -0.34f)
                lineToRelative(-6.884f, 7.516f)
                arcToRelative(0.467f, 0.467f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.682f)
                lineToRelative(6.884f, 7.517f)
                curveToRelative(0.318f, 0.304f, 0.863f, 0.088f, 0.863f, -0.341f)
                verticalLineTo(15.68f)
                curveToRelative(0f, -0.267f, 0.227f, -0.483f, 0.506f, -0.483f)
                horizontalLineToRelative(9.093f)
                curveToRelative(0.28f, 0f, 0.506f, -0.216f, 0.506f, -0.482f)
                verticalLineTo(9.284f)
                arcToRelative(0.494f, 0.494f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.506f, -0.482f)
                horizontalLineToRelative(-9.093f)
                arcToRelative(0.494f, 0.494f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.506f, -0.483f)
                close()
            }
        }.build()

        return _ArrowBigLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigLeft: ImageVector? = null
