package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Waves: ImageVector
    get() {
        if (_Waves != null) {
            return _Waves!!
        }
        _Waves = ImageVector.Builder(
            name = "Outline.Waves",
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
                moveToRelative(3f, 5.918f)
                lineToRelative(1.764f, -0.887f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.472f, 0f)
                lineToRelative(0.528f, 0.266f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.472f, 0f)
                lineToRelative(0.528f, -0.266f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.472f, 0f)
                lineTo(21f, 5.918f)
                moveTo(3f, 10.446f)
                lineToRelative(1.764f, -0.888f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.472f, 0f)
                lineToRelative(0.528f, 0.266f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.472f, 0f)
                lineToRelative(0.528f, -0.266f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.472f, 0f)
                lineToRelative(1.764f, 0.888f)
                moveTo(3f, 14.973f)
                lineToRelative(1.764f, -0.888f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.472f, 0f)
                lineToRelative(0.528f, 0.266f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.472f, 0f)
                lineToRelative(0.528f, -0.266f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.472f, 0f)
                lineToRelative(1.764f, 0.888f)
                moveTo(3f, 19.5f)
                lineToRelative(1.764f, -0.887f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.472f, 0f)
                lineToRelative(0.528f, 0.265f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.472f, 0f)
                lineToRelative(0.528f, -0.265f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.472f, 0f)
                lineTo(21f, 19.5f)
            }
        }.build()

        return _Waves!!
    }

@Suppress("ObjectPropertyName")
private var _Waves: ImageVector? = null
