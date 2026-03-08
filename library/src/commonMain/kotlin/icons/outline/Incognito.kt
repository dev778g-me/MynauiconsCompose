package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Incognito: ImageVector
    get() {
        if (_Incognito != null) {
            return _Incognito!!
        }
        _Incognito = ImageVector.Builder(
            name = "Outline.Incognito",
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
                moveTo(21f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 0f)
                moveTo(3f, 10.412f)
                horizontalLineToRelative(18f)
                moveToRelative(-16f, -0.189f)
                lineToRelative(0.614f, -2.6f)
                curveToRelative(0.545f, -2.31f, 0.818f, -3.466f, 1.632f, -4.139f)
                curveToRelative(0.545f, -0.45f, 0.81f, 0.073f, 1.601f, 0.468f)
                curveToRelative(1.004f, 0.502f, 2.177f, 0.103f, 3.186f, -0.39f)
                curveToRelative(1.008f, -0.494f, 2.973f, -0.755f, 4.036f, -0.393f)
                curveToRelative(0.976f, 0.334f, 0.983f, 0.762f, 1.391f, 1.71f)
                curveToRelative(0.733f, 1.703f, 1.114f, 3.54f, 1.54f, 5.344f)
                moveTo(10f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 0f)
                moveToRelative(0f, -1.206f)
                lineToRelative(0.658f, -0.349f)
                arcToRelative(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.684f, 0f)
                lineToRelative(0.658f, 0.349f)
            }
        }.build()

        return _Incognito!!
    }

@Suppress("ObjectPropertyName")
private var _Incognito: ImageVector? = null
