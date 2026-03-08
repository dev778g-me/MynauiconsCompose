package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DangerCircle: ImageVector
    get() {
        if (_DangerCircle != null) {
            return _DangerCircle!!
        }
        _DangerCircle = ImageVector.Builder(
            name = "Outline.DangerCircle",
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
                moveToRelative(-9f, -4.373f)
                verticalLineToRelative(5.5f)
                moveToRelative(0f, 3.246f)
                verticalLineToRelative(-0.5f)
            }
        }.build()

        return _DangerCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DangerCircle: ImageVector? = null
