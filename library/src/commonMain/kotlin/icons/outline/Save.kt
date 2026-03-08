package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Save: ImageVector
    get() {
        if (_Save != null) {
            return _Save!!
        }
        _Save = ImageVector.Builder(
            name = "Outline.Save",
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
                moveTo(16.25f, 21f)
                verticalLineToRelative(-4.765f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.594f, -1.588f)
                horizontalLineTo(9.344f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.594f, 1.588f)
                verticalLineTo(21f)
                moveToRelative(8.5f, -17.715f)
                verticalLineToRelative(2.362f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.594f, 1.588f)
                horizontalLineTo(9.344f)
                arcTo(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 5.647f)
                verticalLineTo(3f)
                moveToRelative(8.5f, 0.285f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.93f, 3f)
                horizontalLineTo(7.75f)
                moveToRelative(8.5f, 0.285f)
                curveToRelative(0.344f, 0.156f, 0.661f, 0.374f, 0.934f, 0.645f)
                lineToRelative(2.382f, 2.375f)
                arcTo(3.17f, 3.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 8.55f)
                verticalLineToRelative(9.272f)
                arcTo(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.313f, 21f)
                horizontalLineTo(6.688f)
                arcTo(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 17.823f)
                verticalLineTo(6.176f)
                arcTo(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.688f, 3f)
                horizontalLineTo(7.75f)
            }
        }.build()

        return _Save!!
    }

@Suppress("ObjectPropertyName")
private var _Save: ImageVector? = null
