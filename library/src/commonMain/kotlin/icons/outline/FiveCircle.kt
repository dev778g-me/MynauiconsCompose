package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FiveCircle: ImageVector
    get() {
        if (_FiveCircle != null) {
            return _FiveCircle!!
        }
        _FiveCircle = ImageVector.Builder(
            name = "Outline.FiveCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 8f)
                curveToRelative(-2f, 0.5f, -4.5f, 0f, -4.5f, 0f)
                verticalLineToRelative(2.852f)
                horizontalLineToRelative(2.778f)
                curveToRelative(1.227f, 0f, 2.222f, 0.852f, 2.222f, 1.902f)
                verticalLineToRelative(1.12f)
                curveToRelative(0f, 2.818f, -5f, 2.852f, -5f, 0f)
            }
        }.build()

        return _FiveCircle!!
    }

@Suppress("ObjectPropertyName")
private var _FiveCircle: ImageVector? = null
