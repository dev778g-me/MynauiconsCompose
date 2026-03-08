package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Support: ImageVector
    get() {
        if (_Support != null) {
            return _Support!!
        }
        _Support = ImageVector.Builder(
            name = "Outline.Support",
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
                moveToRelative(18f, 6f)
                lineToRelative(-3.525f, 3.525f)
                moveTo(6f, 18f)
                lineToRelative(3.525f, -3.525f)
                moveTo(6f, 6f)
                lineToRelative(3.525f, 3.525f)
                moveTo(18f, 18f)
                lineToRelative(-3.525f, -3.525f)
                moveToRelative(-4.95f, 0f)
                curveToRelative(-1.348f, -1.348f, -1.348f, -3.601f, 0f, -4.95f)
                moveToRelative(0f, 4.95f)
                curveToRelative(1.348f, 1.348f, 3.601f, 1.348f, 4.95f, 0f)
                moveToRelative(0f, 0f)
                curveToRelative(1.348f, -1.348f, 1.348f, -3.601f, 0f, -4.95f)
                moveToRelative(0f, 0f)
                curveToRelative(-1.348f, -1.348f, -3.601f, -1.348f, -4.95f, 0f)
            }
        }.build()

        return _Support!!
    }

@Suppress("ObjectPropertyName")
private var _Support: ImageVector? = null
