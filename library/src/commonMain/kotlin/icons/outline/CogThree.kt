package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CogThree: ImageVector
    get() {
        if (_CogThree != null) {
            return _CogThree!!
        }
        _CogThree = ImageVector.Builder(
            name = "Outline.CogThree",
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
                moveTo(8.4f, 18.235f)
                arcToRelative(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, -12.47f)
                moveToRelative(-7.2f, 12.47f)
                arcTo(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.765f, 8.4f)
                moveTo(8.4f, 18.235f)
                lineToRelative(-0.9f, 1.56f)
                moveToRelative(8.1f, -14.03f)
                arcTo(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.765f, 8.4f)
                moveTo(15.6f, 5.765f)
                lineToRelative(0.9f, -1.56f)
                moveTo(5.765f, 8.4f)
                lineToRelative(-1.56f, -0.9f)
                moveToRelative(10.295f, 6f)
                lineToRelative(5.294f, 3f)
                moveTo(12f, 21f)
                verticalLineToRelative(-1.8f)
                moveTo(12f, 9f)
                verticalLineTo(3f)
                moveToRelative(4.5f, 16.794f)
                lineToRelative(-0.899f, -1.558f)
                moveToRelative(-8.1f, -14.03f)
                lineToRelative(0.898f, 1.558f)
                moveTo(20.999f, 12f)
                horizontalLineToRelative(-1.798f)
                moveToRelative(-16.2f, 0f)
                horizontalLineToRelative(1.798f)
                moveToRelative(14.995f, -4.5f)
                lineToRelative(-1.558f, 0.899f)
                moveTo(9.5f, 13.5f)
                lineToRelative(-5.294f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 12f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            }
        }.build()

        return _CogThree!!
    }

@Suppress("ObjectPropertyName")
private var _CogThree: ImageVector? = null
