package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ShieldOne: ImageVector
    get() {
        if (_ShieldOne != null) {
            return _ShieldOne!!
        }
        _ShieldOne = ImageVector.Builder(
            name = "Outline.ShieldOne",
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
                moveTo(6.183f, 15.092f)
                curveTo(5.478f, 13.836f, 5f, 12.455f, 5f, 11.018f)
                verticalLineToRelative(-4.93f)
                curveToRelative(0f, -0.267f, 0.198f, -0.489f, 0.457f, -0.515f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.582f, -2.047f)
                lineToRelative(0.61f, -0.417f)
                arcToRelative(0.62f, 0.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.702f, 0f)
                lineToRelative(0.61f, 0.417f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.582f, 2.047f)
                curveToRelative(0.26f, 0.026f, 0.457f, 0.248f, 0.457f, 0.514f)
                verticalLineToRelative(4.93f)
                curveToRelative(0f, 1.438f, -0.478f, 2.819f, -1.183f, 4.075f)
                moveToRelative(-11.634f, 0f)
                curveToRelative(1.538f, 2.74f, 4.16f, 4.887f, 5.282f, 5.727f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.07f, 0f)
                curveToRelative(1.122f, -0.84f, 3.744f, -2.988f, 5.282f, -5.727f)
                moveToRelative(-11.634f, 0f)
                lineToRelative(5.25f, -3.677f)
                arcToRelative(0.985f, 0.985f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.134f, 0f)
                lineToRelative(5.25f, 3.677f)
            }
        }.build()

        return _ShieldOne!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldOne: ImageVector? = null
